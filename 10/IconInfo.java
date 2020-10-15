import java.awt.*;

public interface IconInfo {
  Image getIcon(int iconType);
  public static final int ICON_16x16 = 1;
  public static final int ICON_32x32 = 2;
}
