# 28) Write an R Program to calculate Decimal into binary of a given number.

decimal_num <- 10
binary_num <- as.integer(intToBits(decimal_num))
cat("Decimal to Binary:", paste(rev(binary_num), collapse = ""), "\n")


# as.integer(intToBits(decimal_num)):Converts the decimal number into its binary representation 
#                                     and stores it as an integer in the variable binary_num.

# paste(rev(binary_num), collapse = ""): This combines the elements of the reversed integer 
#       vector binary_num into a single string, where each element is concatenated without 
#     any separator(collapse = ""). This creates a binary string representing the binary number.

#      paste(rev(binary_num), collapse = "") converts the binary number represented as an 
#       integer vector into a binary string.