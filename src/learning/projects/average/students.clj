(ns learning.projects.average.students)

(def scores-students [3, 6.1, 7.0, 5.1, 6.7])

(defn average-students
  [scores]
  (for [x scores]
    (if (>= x 6)
      {:score x :passed? true}
      {:score x :passed? false})))

(println (average-students scores-students))