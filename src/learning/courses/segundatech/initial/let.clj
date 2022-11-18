(ns learning.courses.segundatech.initial.let)

(defn fine-amount
  "Calculates the fine amount"
  [value]
  (let [fie-percentage 0.1]
    (* fie-percentage value)))

(defn total-value
  "Calculates the total value"
  [value]
  (let [fine-percentage 0.1
        total-percentage (* value fine-percentage)]
    (+ value total-percentage)))

(println "fine-amount:" (fine-amount 10000))
(println "total-amount:" (total-value 10000))