# Entity Resolution Project

## Introduction

Welcome to the Entity Resolution project! This software is designed to address data deduplication challenges by cleaning and unifying information from diverse sources, including SQL databases, NoSQL document-oriented databases, and Excel files. The primary objective is to enhance data quality by resolving discrepancies and eliminating errors, particularly typos, through a systematic approach.

## Features
### Data Handling

- **Data Sources**: Connect and fetch data efficiently from SQL databases, NoSQL document-oriented databases, and Excel sheets.
- **Schema Alignment**: Manually identify attribute correspondences to align schemas effectively.

### Entity Resolution Process

1. **Blocking**: Reduce computation efforts by employing blocking methods, such as domain-specific attribute blocking and Q-grams.
2. **Matching Attributes**: Choose deduplication attributes with a fundamental method, allowing manual expert input.
3. **Similarity Measurement**: Generate pairwise features from individual attributes, employing similarity metrics like Levenshtein, Pearson correlation for numerical attributes.
4. **Matching Algorithm**: Define similarity between two tuples/documents using weighted distance measures and thresholds.

### Comparison Strategy

- **Comparison Strategy**: Parameterize attributes, distances, and matching functions for a flexible and evolving comparison strategy.
- **Naive Method**: Apply the matching function to every possible pair within the same block.
- **Fusion Algorithm**: Implement a fusion algorithm for merging duplicate profiles, considering different types of data attributes.


## Output

The software provides deduplicated data, deduplication statistics, and visualizations of the results. Additionally, it supports the implementation of various methods, including statistical.

## Technologies Used
- Java
- MySQL
- Maven

[![My Skills](https://skillicons.dev/icons?i=java,mysql,maven)](https://skillicons.dev)
## Installation

Install via

```bash
    git clone https://github.com/hkoutar7/projectEntityResolution.git project
```
    ## Contributing

Contributions are welcome! If you'd like to contribute to the project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive messages.
4. Push your branch to your fork.
5. Submit a pull request to the main repository.
## Authors

- [hkoutar7](https://github.com/hkoutar7)
- [Boufrouk](https://github.com/boufrouk)
## license

Feel free to customize it further based on your specific project details!
