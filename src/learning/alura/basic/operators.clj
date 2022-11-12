(ns learning.alura.basic.operators)

(def number-one 2)
(def number-two 10)

;; Arithmetic Operators
(println "Sum:" (+ number-one number-two))
(println "Sub.:" (- number-one number-two))
(println "Multi.:" (* number-one number-two))
(println "Div.:" (/ number-one number-two) "\n")

(println "Inc:" (inc number-one))
(println "Dec:" (dec number-one))
(println "Max:" (max number-one number-two))
(println "Min:" (min number-one, number-two))
(println "Rem:" (rem number-one number-two) "\n")

;; Relational Operators
(println "Equality:" (= number-one number-two))
(println "Diference:" (not= number-one number-two))
(println "Less than:" (< number-one number-two))
(println "Greater than:" (> number-one number-two))
(println "Less than or equal:" (<= number-one number-two))
(println "Greater than or equal:" (>= number-one number-two) "\n")

;; Logical Operators
(println "Operator and:" (and true true))
(println "Operator or:" (or true true))
(println "Operator not:" (not true) "\n")

;; Bitwise Operators
(def x (bit-and 00111100 00001101))
(println "Bit-and" x)

(def y (bit-or 00111100 00001101))
(println "Bit-or" y)

(def z (bit-xor 00111100 00001101))
(println "Bit-xor" z)