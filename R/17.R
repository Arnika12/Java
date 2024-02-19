#17) Write R program to read number and print corresponding day name in a
#week

getDayName <- function(dayNumber) {
  days <- c("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday")
  if (dayNumber >= 1 && dayNumber <= length(days)) {
    cat("The day corresponding to the number", dayNumber, "is:", days[dayNumber], "\n")
  } else {
    cat("Invalid day number")
  }
}

dayNumber <- as.numeric(readline(prompt = "Enter a number (1-7) representing a day of the week: "))
dayName <- getDayName(dayNumber)
