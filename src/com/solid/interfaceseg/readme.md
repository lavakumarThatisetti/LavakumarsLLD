This principle states that no client should be forced to depend on interfaces they do not use.
This means that a class should not have to implement methods it doesn't need.

Which means larger interfaces should be split into smaller ones. By doing so, we can ensure that
implementing classes only need to be concerned about the methods that are of interest to them.


Use Cases

1. Consider an interface `Printer` with methods `print`, `fax` and `scan`.
If we have a class `SimplePrinter` that implements `Printer` but can only print, not fax or scan,
then this would violate ISP.
A better approach would be to have separate interfaces: `Printable`, `Faxable`, and `Scannable`.

2. In a media system, you might have a `MediaPlayer` interface with methods to play video and audio.
If you have a `AudioPlayer` class that only plays audio, it shouldn't need to implement the video play 
method. A better approach would be to separate the `MediaPlayer` interface into two
interfaces: `AudioPlayer` and `VideoPlayer`