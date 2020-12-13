package soundsystem;

import java.util.List;

public interface MediaPlayer {

  void play();
  int trackCount();
  List<String> getTrackTitles();
}
