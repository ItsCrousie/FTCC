import math

def createVector(x, y, z):
  return [x, y, z]

def addVector(vector1, vector2):
  return [vector1[0] + vector2[0], vector1[1] + vector2[1], vector1[2] + vector2[2]]

def subtractVector(vector1, vector2):
  return [vector2[0] - vector1[0], vector2[1] - vector1[1], vector2[2] - vector1[2]]

def multiplyVectorByScalar(scalar, vector):
  return [vector[0] * scalar, vector[1] * scalar, vector[2] * scalar]

vector1 = createVector(6, -6, -7)
vector2 = createVector(11, -12, -15)

print(addVector(multiplyVectorByScalar(4, vector1), multiplyVectorByScalar(7.5, vector2)))