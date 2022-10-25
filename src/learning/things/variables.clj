(ns learning.things.variables)

;; Global
(def number-one 22)
(println "Testing global variable:" number-one)

(def is-ok? true)
(println "Testing if is ok:" is-ok?)

;; Local
(let [number-two 23
      number-three 24
      probably-a-variable "this is variable"]
  (println "Testing local variable:" probably-a-variable number-two number-three))