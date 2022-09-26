<h1 align="center">
  <span><h3>NewsBreeze</h3></span>
    <p align="center">
    <a href="https://developer.android.com/studio"><img src="https://img.shields.io/badge/Built%20With-Android%20Studio-green?style=for-the-badge" alt="Android Studio"/></a>
    <a href="https://developer.android.com/studio"><img src="https://img.shields.io/badge/Launguages-Kotlin-blue?style=for-the-badge" alt="Kotlin"/></a>
    <a href="https://developer.android.com/studio"><img src="https://img.shields.io/badge/Architecture%20Used-MVVM-critical?style=for-the-badge" alt="Kotlin"/></a>
  </p>
</h1>


## Overview

This is an android application, where user have access to current and historic news articles published by over 80,000 worldwide sources. The main focus of this application is to connect news articles from all around the
world and deliver it to user as fast as possible in best visualize
way.


## Features

- User can get the article based on the category.
- User can search for the particular article from more than 80,000 articles.
- User can save the article.
- User can search for the particular article in saved news.
- User can filter the news by date or publishers (To be implemented).
- User can switch to dark mode (To be implemented).

## Architecture

#### MVVM (Model View View Model) Architecture

<img src="/docs/images/mvvm.png" width="32%" alt="mvvm architecture"/>

## Tech Stacks

- Android Studio
- Kotlin
- Libraries used
    - Retrofit
    - NewsAPI
    - Room
    - Picasso
    - roundedimageview
    
## Structure
- Activities
  - MainActivity
- Fragments
  - Home Fragment
  - Detailed News Fragment
  - Saved News Fragment
- View Models
  - Home View Model
  - Detailed News View Model
  - Saved News View Model
- Model
  - NewsResponse
  - Article
- Repositories
  - NewsRepository
    
## Screenshots

<p align="center">
  <img src="/docs/images/home.png" width="32%" alt="Home Page"/>
  <img src="/docs/images/detail.png" width="34%" alt="Detailed News Page"/>
  <img src="/docs/images/saved.png" width="32%" alt="Saved News Page"/>
  <img src="/docs/images/search.png" width="32%" alt="Search"/>
</p>

## Notes
- Detailed Article is showing [+xyz words] due to limit of developer account, which is only 250 words.

## Support

- If you have any issues, feel free to reach out [hiteshsukhwani29@gmail.com](mailto:hiteshsukhwani29@gmail.com).
