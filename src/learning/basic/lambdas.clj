(ns learning.basic.lambdas)

;; Function (Sum) - Comparison code.
(defn sum
  [a b]
  (+ a b))

(print "The sum is:" (sum 2 2) "\n")


;; Functions Lambdas (Sum)
(print "The sum is:" ((fn [number-one number-two] (+ number-one number-two)) 2 2) "\n")
(print "The sum is:" ((fn [a b] (+ a b)) 2 2) "\n")
(print "The sum is:" (#(+ %1 %2) 2 2) "\n")