# Globalwaves | Java - Music Streaming Player CLI

## Overview

Globalwaves is a CLI music streaming player built using Java. The project leverages Object-Oriented Programming (OOP) principles and design patterns, such as Factory and Singleton, to handle a large number of songs efficiently. The player supports multiple users, each with their own preferences, playlists, and song selection features.

## Key Features

- **Multi-User Support**: The player can handle multiple users simultaneously, each with unique preferences and playlists.
- **Playlist Creation**: Users can create custom playlists and manage their song collection.
- **Time-Lapse Simulation**: Simulate the passage of time to explore features like song recommendations based on listening habits.
- **Song Recommendations**: The system suggests songs to users based on their listening history and preferences.
- **Concurrent Playback**: Support for playing songs concurrently in different user sessions.
- **Pagination**: The application supports pagination for listing users and artists, improving the navigation experience.
- **Song Selection and Rewind**: Users can select songs from their library and rewind to previous tracks during playback.

## Technologies Used

- **Java**: The project is implemented using Java to ensure efficiency and scalability.
- **Object-Oriented Programming (OOP)**: The system is designed using OOP principles to ensure maintainability and extensibility.
- **Design Patterns**: The Factory and Singleton patterns are used to manage object creation and ensure the system's reliability.
- **Jackson Library**: Used for initializing the song library and user databases in JSON format.

## Additional Implementations

- **User Management**:
  - Users can register, authenticate, and manage their personal settings. Each user can maintain their own profile and playlists.
- **Song History**:
  - The player keeps track of the songs each user listens to, allowing them to view their listening history and resume from where they left off.
- **Database Integration**:
  - The application uses a simple file-based database in JSON format to store user profiles, song libraries, and playlists, ensuring data persistence across sessions.
- **Error Handling**:
  - The system is designed with robust error handling to ensure smooth operation even when unexpected user actions occur (e.g., invalid song requests, playlist management errors).
- **Scalability**:
  - The player is built to handle a large number of songs (1000+ per session) without performance degradation, thanks to its efficient data structures and algorithms.
