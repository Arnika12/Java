# 32) Consider Weather dataset 
#     i) Selecting using the column number 
#     ii) Selecting using the column name
#     iii) Make a scatter plot to compare Wind speed and temperature.

weather <- read.csv("D:\\MSc FY\\Programming\\R\\weather.csv")
print(weather)

# i)
select_colnum <- weather[, c(2, 3, 4, 5)]  # Selecting columns 2, 3, 4, and 5
print(select_colnum)

# ii)
select_colname <- weather[, c("MinTemp","MaxTemp","Rainfall","WindSpeed9am","WindSpeed3pm","Temp9am","Temp3pm")] 
print(select_colname)

# iii) scatter plot
plot(x=weather$WindSpeed9am,y=weather$Temp9am, main="Wind Speed vs. Temperature @9 am", xlab="Wind Speed", ylab="Temperature", col="blue")

