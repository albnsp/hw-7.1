import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getLength() {
        return Math.abs(end - start) + 1;
    }

    public boolean isValid() {
        return start <= end;
    }

    public boolean isIntersecting(Range otherRange) {
        return (start <= otherRange.getEnd() && end >= otherRange.getStart()) ||
                (otherRange.getStart() <= end && otherRange.getEnd() >= start);
    }
}

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Range> ranges = new ArrayList<>();

        System.out.print("Введите количество диапазонов: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nВведите начальную точку для диапазона " + (i + 1) + ": ");
            int start = scanner.nextInt();
            System.out.print("\nВведите конечную точку для диапазона " + (i + 1) + ": ");
            int end = scanner.nextInt();

            Range range = new Range(start, end);
            ranges.add(range);
        }

        System.out.println("\nДлина каждого диапазона:");
        for (Range range : ranges) {
            if (range.isValid()) {
                System.out.println(range.getLength());
            } else {
                System.out.println("\nОшибка: начальная точка больше конечной");
            }
        }

        System.out.println("\nПроверка пересечения диапазонов:");
        for (int i = 0; i < ranges.size(); i++) {
            Range range1 = ranges.get(i);
            for (int j = i + 1; j < ranges.size(); j++) {
                Range range2 = ranges.get(j);
                if (range1.isIntersecting(range2)) {
                    System.out.println("Диапазон " + range1.getStart() + "-" + range1.getEnd() +
                            " пересекается с диапазоном " + range2.getStart() + "-" + range2.getEnd());
                }
            }
        }
    }
}