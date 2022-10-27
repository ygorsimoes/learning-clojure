(ns learning.basic.lambdas)

;; Functions Lambdas (Sum)
(println "[Lambda 1] The sum is:" ((fn [number-one number-two] (+ number-one number-two)) 2 2))
(println "[Lambda 2] The sum is:" ((fn [a b] (+ a b)) 2 2))
(println "[Lambda 3] The sum is:" (#(+ %1 %2) 2 2) "\n")

(def anonymous-sum-function #(+ %1 %2))
(println "[Anonymous sum function.] The sum is:" (anonymous-sum-function 2 2) "\n")

;; Function (Sum) - Comparison code.
(defn sum
  [a b]
  (+ a b))

(println "[Normal function.] The sum is:" (sum 2 2))