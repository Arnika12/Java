# WRP to print first 10 fibonacci numbers

get_fibonacci <- function(n){
  fib <- numeric(n)  # Initialize a numeric vector to store Fibonacci numbers
  
  fib[1] <- 0
  fib[2] <- 1
  
  for (i in 3:n) {
    fib[i] <- fib[i - 1] + fib[i - 2]
  }
 return(fib)
}

n=10
print(get_fibonacci(n))