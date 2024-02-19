data <- read.csv("airquality.csv")
print(data)

cat("The Mean is:",mean(data$Wind))
cat("The Median is:",median(data$Wind))
cat("The Quantile is:",quantile(data$Wind,probs = c(0.25,0.5,0.75)))
cat("The Standard Deviation is:",sd(data$Wind))
cat("The Variance is:",var(data$Wind))

covariance <- (sd(data$Wind)/mean(data$Wind))*100
cat("The Co-Variance is:",covariance)