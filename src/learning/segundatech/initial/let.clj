(ns learning.segundatech.initial.let)

(defn fine-amount
  "calculates the fine amount"
  [value]
  (let [fie-percentage 0.1]
    (* fie-percentage value)))

(defn total-amount
  "calculates the total amount"
  [value]
  (let [total-percentage (* value 0.1)]
    (+ value total-percentage)))

(println "fine-amount:" (fine-amount 10000))
(println "total-amount:" (total-amount 10000))