package soundsystem;

import java.util.List;

public interface CompactDisc {
  void play();
  int trackCount();
  List<String> getTrackTitles();
}
