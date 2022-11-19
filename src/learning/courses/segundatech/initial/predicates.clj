(ns learning.courses.segundatech.initial.predicates)

;; Predicates are functions which evaluate a condition and return
;; a value true or false (boolean).

; equals?
(println (= 1 true))
(println (= "hello" true))
(println (= 1 false))
(println (= nil true))

;; is a number?
(println (number? 1))
(println (number? "hello"))

;; odd or even?
(println (odd? 3))
(println (even? -2))