30 Days App
created by Alexandru Rosca
started on 27.07.2025

This will be more like a journal and a thought process but I think it also serves as documentation :D

The structure:
    -> will be based on a lazy column that contains cards with each Tip
        -> Tips will have a title, image and body
        -> Tips will be implemented as a data class 
        -> the cards will be saved under ui.components/TipCard.kt
    -> when using landscape the layout within the cards will change for better display (actually did this, niceee :D)

Features that *might* be added:
    -> when tapping on a card you can focus it entirely (added :D)
    -> when tapping on the picture of a card you can see the picture in full size and zoomable (added :D but not sure if zoomable,
                                don't have a phone to test it and can't figure out the gesture on a trackpad)

Later notes:
    It was a nice process, found new things, like routes for different pages (proud of that feature),
also spent a lot of time on adding the photos since they were in HEIC format that apparently Android Studio doesn't support.
It took a while to create the two different photo resolutions but it was needed because with the higher quality pictures in the
lazy column the app kept crashing because it was loading too much memory (198 Mb as seen in error), so I added a lower
quality picture for the column and higher quality for when you focus the photo.
    Importing the themes from Google was also a blast (not), since there was no clear explanation on how to add it, I had files that
had no correspondent in my project, but with loads of research I got it done (had to :D), and also have light & dark theme.
    Don't judge the font :), wanted something not so basic, I wouldn't call it that aesthetic but it is different.
    
    In the end, proud of my project, I enjoy the features that I've added, focusing a card when tapping it and also
focusing a picture when tapping it, and you can go back from any of these by tapping again somewhere on the screen, and
especially on the landscape display, having 2 cards on a row, seems more user friendly and surely looks better.

It was a pleasure to work on this project, will add it to my CV.


For any questions, tips or anything else, you can find me at the following email: alexandrurosca968@gmail.com. I will get back to you shortly :D