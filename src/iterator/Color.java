package iterator;

public enum Color {

    RED, GREEN, ORANGE, WHITE, BLACK;

    public static Iterator<Color> iterator() {
        return new ColorIterator();
    }

    private static class ColorIterator implements Iterator<Color> {

        private int position;

        @Override
        public boolean hasNext() {
            return position < Color.values().length;
        }

        @Override
        public Color next() {
            return Color.values()[position++];
        }
    }
}
