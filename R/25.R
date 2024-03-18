# 25) Write a R program to find nth highest value in a given vector.

# Function to find the nth highest value in a vector
find_nth_highest <- function(vector, n) {
  sorted_vector <- sort(unique(vector), decreasing = TRUE)  # Sort the vector in descending order and remove duplicates
  if (n <= length(sorted_vector)) {
    return(sorted_vector[n])  # Return the nth highest value if it exists
  } else {
    return(NA)  # Return NA if n exceeds the length of the sorted vector
  }
}

# Example usage:
vector <- c(3, 7, 1, 5, 9, 2, 6, 8, 4)  # Example vector
n <- 3  # Find the 3rd highest value
nth_highest <- find_nth_highest(vector, n)
if (!is.na(nth_highest)) {
  cat("The", n, "th highest value in the vector is:", nth_highest, "\n")
} else {
  cat("Invalid input: There are not enough unique values in the vector to find the", n, "th highest value.\n")
}



