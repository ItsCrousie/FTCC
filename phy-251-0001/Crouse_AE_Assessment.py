import numpy as np
import math

# Prompt Values
shear_modulus_steel = 75e9 # Pa
density_steel = 7850  # kg/m^3
frequency_range = np.linspace(1, 100, 1000)  # source: data analyst on stackoverflow suggested this; essentially creates a table of 1000 test-able frequencies with index 1-100
angular_frequency = 2 * np.pi * frequency_range  # rad/s
#We want to find when this thing's natural freqency = the resonance, because then the building's in trouble.
#natural_frequency = ?
#optimal_length = ?
#max_occilation_amplitude =?

# Assumptions about the rod and force affecting it.
# N -> Just randomly came up with this... I have no idea how much force and earthquake puts out.
force_driving = 100
# m makes calculation easier /_ \
length = 1.0

def determine_natural_frequency(length, density, shear_modulus):
    # We model the building as a pendulum.
    I = (1 / 3) * density * length ** 3
    k = shear_modulus
    natural_angular_frequency = np.sqrt(k / I)
    return natural_angular_frequency / (2 * np.pi) # Hz

def determine_resonance_height(frequency_range, force_driving, density, shear_modulus):
    #Determine the height at which the resonance of the building matches the natural frequency. - Because then the building will collapse if they're close.
    max_amplitude = 0
    optimal_length = 0

    # Test lengths
    for length in np.linspace(0.1, 100, 1000):
        natural_frequency = determine_natural_frequency(length, density, shear_modulus)
        # Check if natural_frequency matches
        if np.isclose(natural_frequency, frequency_range).any():
            # *Another assumption: We also ignore damping in this caluclation
            amplitude = force_driving / (2 * np.pi * natural_frequency) ** 2
            # If the ampltude supercedes the max; g'bye, building.
            if amplitude > max_amplitude:
                max_amplitude = amplitude
                optimal_length = length

    # stupid numpy conversion to actual numbers agian, I suck at python. :)
    return round(optimal_length.item(), 3), round(max_amplitude.item(), 3)

#Find the required things:
optimal_length, max_amplitude = determine_resonance_height(
  frequency_range,
  force_driving, density_steel,
  shear_modulus_steel
  )

natural_frequency_at_optimal_length = round(determine_natural_frequency(optimal_length, density_steel, shear_modulus_steel), 3)

# Print everything with possibly the worst print function ever seen in code.
print("Optimal Length: {}[m]\nNatural Frequency: {}[Hz]\nMax Oscillation of Steel Column: {}[m]".format(optimal_length, natural_frequency_at_optimal_length, max_amplitude))