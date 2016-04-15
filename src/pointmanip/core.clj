(ns pointmanip.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

; Some trial points for testing
(def point1 [5,3])
(def point2 [11,5])

; Returns a vector of the values stored in p1 & p2 at requested addr
(defn vect_pair
  [p1 p2 addr]
  (vector (get p1 addr) (get p2 addr)))

; More versatile function for distance
(defn dist_indiv
  [p1 p2 addr]
  (-> (- (get p2 addr) (get p1 addr)) (Math/pow 2)))

; Getting into distance calculation
(defn dist_main
  [p1 p2]
  (Math/sqrt (+ (dist_indiv p1 p2 0) (dist_indiv p1 p2 1))))

; Calculates midpoint between two points supplied
(defn midpt_indiv
  [p1 p2 addr]
  (-> (+ (get p1 addr) (get p2 addr)) (/ 2)))

(defn midpt_main
  [p1 p2]
  (vector (midpt_indiv p1 p2 0) (midpt_indiv p1 p2 1)))

(defn point_info
  [p1 p2]
  (println "The distance between the given points is"(dist_main p1 p2)".")
  (println "The midpoint of the given points is"(midpt_main p1 p2)"."))

