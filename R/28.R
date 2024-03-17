# 28) Write an R Program to calculate Decimal into binary of a given number.

decimal_num <- 10
binary_num <- as.integer(intToBits(decimal_num))
cat("Decimal to Binary:", paste(rev(binary_num), collapse = ""), "\n")

# binary_num <- as.integer(intToBits(decimal_num)): Converts the decimal number into its binary representation and stores it as an integer in the variable binary_num.
# cat(“Decimal to Binary:”, paste(rev(binary_num), collapse = “”), “\n”): Prints the message “Decimal to Binary:” followed by the binary representation of 33 by reversing the binary digits and removing spaces, separated by a newline.

