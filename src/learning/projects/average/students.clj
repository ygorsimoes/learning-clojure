(ns learning.projects.average.students)

(def scores-students [3, 6.1, 7.0, 5.1, 6.7])

(defn average-students
  [scores]
  (for [x scores]
    (if (>= x 6)
      [x true]
      [x false])))

(defn passed?
  [approval]
  (for [x approval]
    (if (get x 1)
      (println "Pass with:" (get x 0))
      (println "Fail with:" (get x 0)))))

(passed? (average-students scores-students))