package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class RadialGradientPaint implements Paint {
    public RadialGradientPaint(float cx, float cy, float radius, float[] fractions, Color[] colors) {
        this(new Point2D.Float(cx, cy), radius, fractions, colors);
    }

    public RadialGradientPaint(Point2D center, float radius, float[] fractions, Color[] colors) {

    }

    @Override
    public PaintContext createContext(ColorModel colorModel, Rectangle rectangle, Rectangle2D rectangle2D, AffineTransform affineTransform, RenderingHints renderingHints) {
        return null;
    }

    @Override
    public int getTransparency() {
        return 0;
    }
}
