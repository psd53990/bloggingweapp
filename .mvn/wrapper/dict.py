base = {
    'k1': {'k2': {'k3': {'k4': 'v1'}}},
    'k5': {'k6': 'v2'},
    'k7': 'v3',
    'k8': {'k9': {'k10': 'v4'}}
}

def extract_values(d):
    values = []
    for value in d.values():
        if isinstance(value, dict):
            values.extend(extract_values(value))
        else:
            values.append(value)
    return values

result = extract_values(base)
print(result)
