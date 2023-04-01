(ns learning.courses.alura.functional-programming.anonymous-functions-and-lambdas)

(defn apply-discount?
  [gross-value]
  (> gross-value 100))

(defn discounted-value
  "Return the value with a 10% discount if the value is greater than 100."
  [gross-value]
  (if (apply-discount? gross-value)
    (let [discount-rate (/ 10 100)
          discounted (* gross-value discount-rate)]
      (- gross-value discounted))
    gross-value))

;; Testing the function...
(discounted-value 100)