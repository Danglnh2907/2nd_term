import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

class Utility {
    public static String repeat(String str, int times) {
        String result = "";
        while (times > 0) {
            result += str;
            times--;
        }
        return result;
    }

    public static String formatIP (String ip) {
        String result = "";
        for (int i = 0; i < 32; i++) {
            result += ip.charAt(i);
            if ((i + 1) % 8 == 0 && i != 31) {
                result += ".";
            }
        }
        return result;
    }
}

class Convert {
    public static String binary (int num) {
        String result = "";
        while (num > 0) {
            result = Integer.toString(num % 2) + result;
            num /= 2;
        }
        while (result.length() < 8) {
            result = "0" + result;
        }

        return result;
    }

    public static int decimal (String bin) {
        int ans = 0, initialVal = 128;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                ans += initialVal;
            }
            initialVal /= 2;
        }
        return ans;
    }

    public static String convertIP (String ip) {
        String result = "";
        String[] datas = ip.split("\\.");
        for (String data : datas) {
            result += binary(Integer.parseInt(data));
        }
        return result;
    }
}

class EX1 {
    public static int findPrefix (String subnetMask) {
        String[] datas = subnetMask.split("\\.");
        String bin = "";

        for (String data : datas) {
            bin += Convert.binary(Integer.parseInt(data));
        }

        int ans = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {    
                ans++;
            }
        }

        return ans;
    }

    public static String findSubnetMask (int prefix) {
        String result = "";
        int numberOf = 0;
        for (int i = 0; i < prefix / 8; i++) {
            numberOf++;
            if (numberOf == 4) {
                result += "255";
            } else {
                result += "255.";
            }
        }

        if (prefix % 8 != 0) {
            numberOf++;
            result += Integer.toString(Convert.decimal(Utility.repeat("1", prefix % 8) + Utility.repeat("0", 8 - (prefix % 8))));
            if (numberOf < 4) {
                result += ".";
            }
        }

        
        while (numberOf < 4) {
            numberOf++;
            if (numberOf == 4) {
                result += "0";
            } else {
                result += "0.";
            }
        }

        return result;
    }
}

class EX2 {
    public static String categoryAddress(String ip, int prefix) {
        String result;
        String ipBin = Convert.convertIP(ip);
        if (ipBin.substring(prefix).equals(Utility.repeat("0", 32 - prefix))) {
            result = "Network Address";
        } else if (ipBin.substring(prefix).equals(Utility.repeat("1", 32 - prefix))) {
            result = "Broadcast Address";
        } else {
            result = "Host Address";
        }
        return result;
    }
}

class EX3 {
    private static String networkAddress(String ip, int prefix) {
        ip = ip.substring(0, prefix) + Utility.repeat("0", 32 - prefix);
        String[] datas = Utility.formatIP(ip).split("\\.");

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += Convert.decimal(datas[i]);
            if (i != 3) {
                result += ".";
            }
        }

        return result;
    }

    private static String broadCastAddress(String ip, int prefix) {
        ip = ip.substring(0, prefix) + Utility.repeat("1", 32 - prefix);
        String[] datas = Utility.formatIP(ip).split("\\.");

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += Convert.decimal(datas[i]);
            if (i != 3) {
                result += ".";
            }
        }

        return result;
    }

    private static String firstIPHostAddress(String ip, int prefix) {
        ip = ip.substring(0, prefix) + Utility.repeat("0", 31 - prefix) + "1";
        String[] datas = Utility.formatIP(ip).split("\\.");

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += Convert.decimal(datas[i]);
            if (i != 3) {
                result += ".";
            }
        }

        return result;
    }

    private static String lastIPHostAddress(String ip, int prefix) {
        ip = ip.substring(0, prefix) + Utility.repeat("1", 31 - prefix) + "0";
        
        String[] datas = Utility.formatIP(ip).split("\\.");

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += Convert.decimal(datas[i]);
            if (i != 3) {
                result += ".";
            }
        }

        return result;
    }

    private static int numberOfHost(int prefix) {
        return (1 << (32 - prefix)) - 2;
    }

    public static String solve(String ip, int prefix) {
        ip = Convert.convertIP(ip);
        String result = "";

        result += String.format("Network Address: %s\n", networkAddress(ip, prefix));
        result += String.format("Broadcast Address: %s\n", broadCastAddress(ip, prefix));
        result += String.format("First IP - Last IP: %s - %s\n", firstIPHostAddress(ip, prefix), lastIPHostAddress(ip, prefix));
        result += String.format("Number of usable host address: %d\n", numberOfHost(prefix));
        result += Utility.repeat("-", 20) + "\n";

        return result;
    }
}

public class Solve {
    @SuppressWarnings("resource")
    public static void main (String[] args) {
        Scanner sc;
        FileWriter writer;
        String fi, fo;

        if (args.length == 2) {
            fi = args[0];
            fo = args[1];
        } else {
            fi = "input.txt";
            fo = "output.txt";
        }

        try {
            sc = new Scanner(new File(fi));
            writer = new FileWriter(new File(fo));

            String exercise;
            ArrayList<String> dataLines = new ArrayList<>();

            exercise = sc.nextLine();
            while (sc.hasNextLine()) {
                dataLines.add(sc.nextLine());
            }
            
            String result = "", ip;
            int prefix;
            String[] datas;

            for (String dataLine : dataLines) {
                datas = dataLine.split("\\s+");
                if (exercise.equalsIgnoreCase("Exercise 1")) {
                    if (datas[0].equalsIgnoreCase("SubnetMask")) {
                        ip = datas[1];
                        result += String.format("Prefix: %d\n", EX1.findPrefix(ip));
                    } else if (datas[0].equalsIgnoreCase("Prefix")) {
                        prefix = Integer.parseInt(datas[1]);
                        result += String.format("Subnet Mask: %s\n", EX1.findSubnetMask(prefix));
                    }
                } else if (exercise.equalsIgnoreCase("Exercise 2")) {
                    ip = datas[0];
                    prefix = Integer.parseInt(datas[1]);
                    result += String.format("Address type: %s\n", EX2.categoryAddress(ip, prefix));
                } else if (exercise.equalsIgnoreCase("Exercise 3")) {
                    ip = datas[0];
                    prefix = Integer.parseInt(datas[1]);
                    result += EX3.solve(ip, prefix);
                }
            }

            writer.write(result);
            writer.close();
            sc.close();

            sc = new Scanner(System.in);
            System.out.println("Build and run successfully!\nPress ENTER to continue ...");
            sc.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
