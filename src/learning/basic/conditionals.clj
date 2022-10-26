(ns learning.basic.conditionals)

;; Basic conditional
(let [number-one 2
      numbe-two 12]
  (println "Bigger or smaller:" (< number-one numbe-two)))

(let [number-one 5
      number-two 5
      is-bigger? (> number-one number-two)]
  (println "This is bigger?" is-bigger?))


;; Conditional with if and else
(def number-one 2)
(def number-two 5)
(def number-three 5)

(defn sum [a, b]
  (+ a b))

(defn this-is-bigger?
  [a, b, c]
  (if (== c (sum a b))
    ;; Conditional case true
    "Is bigger!")
  ;; Conditional case false
  "Is not bigger!")

(println (this-is-bigger? number-one, number-two, number-three))