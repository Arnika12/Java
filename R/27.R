# 27) Write an R program to extract first 10 English letter in lower case and last
#     10 letters in upper case and extract letters between 22nd to 24th letters in upper case.

t = head(letters, 10)
cat("First 10 letters in lower case : ", t)

t = tail(LETTERS, 10)
cat("Last 10 letters in upper case : ", t)

e = tail(LETTERS[22:24])
cat("Letters between 22nd to 24th letters in upper case : ", e)

