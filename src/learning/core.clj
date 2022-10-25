(ns learning.core)

(require '[learning.calculator.simple-calculator :as math])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (math/calculator 4, 4, 2)))