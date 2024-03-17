#16) Write R program to find whether given number is positive or negative.

# Prompt the user for the number
number <- readline("Enter a number: ")

# Determine and display whether the number is positive, negative, or zero
if (number > 0) {
  cat("The number ",number, " is positive.")
} else if (number < 0) {
  cat("The number  ",number, " is negative.")
} else {
  cat("The number is zero.")
}
