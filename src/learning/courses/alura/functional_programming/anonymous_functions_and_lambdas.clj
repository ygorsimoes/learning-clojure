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

; (Testing)
(discounted-value 100)


; Functions Lambdas (Sum)
(println "[Lambda 1] The sum is:" ((fn [number-one number-two] (+ number-one number-two)) 2 2))
(println "[Lambda 2] The sum is:" ((fn [a b] (+ a b)) 2 2))
(println "[Lambda 3] The sum is:" (#(+ %1 %2) 2 2) "\n")

(def anonymous-sum-function #(+ %1 %2))
(println "[Anonymous sum function.] The sum is:" (anonymous-sum-function 2 2) "\n")

;; Comparison code.
(defn sum
  "Pure sum function"
  [a b]
  (+ a b))

; (Testing)
(println "[Normal function.] The sum is:" (sum 2 2))



