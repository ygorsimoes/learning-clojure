(ns learning.courses.alura.functional-programming.fist-functions)

(defn discounted-value
  "Return the discounted value that is 90% of the gross amount."
  [gross-value]
  (* gross-value 0.9))

;; Testing the function...
(discounted-value 100)