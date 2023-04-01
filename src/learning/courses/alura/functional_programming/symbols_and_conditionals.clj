(ns learning.courses.alura.functional-programming.symbols-and-conditionals)

(defn discounted-value
  "Return the value with a 10% discount if the value is greater than 100."
  [gross-value]
  (if (> gross-value 100)
    (let [discount-rate (/ 10 100)
          discounted (* gross-value discount-rate)]
      (- gross-value discounted))
    gross-value))


should apply discount?

;; Testing the function...
(discounted-value 100)