# NWC Lab 4: Subnet Mask Conversion and Network Address Identification

This Java project automatically solves NWC's lab 4, which involves converting subnet masks, prefixes, and identifying network, broadcast, and host addresses based on an IP address and prefix.

## How to Use This Code

1. **Input Preparation:**
   - Copy the test case from `text.txt` (or create your own test case following the format in `text.txt`).
   - Paste the test case into `input.txt`.

2. **Running the Code:**
   - If you're using an IDE (such as VS Code or IntelliJ):
     - Simply run the code using the IDE's run button.
     - Note that this project cannot be run using NetBeans 8.2 due to differences in project structure.
   - If you want to compile using the Java compiler in the terminal:
     - Assuming you're in the working directory of this project:
       ```bash
       javac -d bin Solve.java
       cd bin
       java Solve ../input.txt ../output.txt
       ```

3. **Viewing the Results:**
   - After the code runs successfully, check the `output.txt` file for the answers.

## Known Limitations

- This project is specifically designed for solving NWC's lab 4 and may not work beyond that scope.
- It only handles IPv4 addresses; IPv6 is not supported.
- The code assumes that all test cases are valid; there is no exception handling. If you input invalid data (e.g., a /33 prefix, a 33-bit IPv4 address, or incorrectly formatted IPv4 addresses), the code may fail.