package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmp = new JobAscByName();
        int rsl = cmp.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmp = new JobDescByName();
        int rsl = cmp.compare(
                new Job("Impl task", 1),
                new Job("Fig bug", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmp = new JobAscByPriority();
        int rsl = cmp.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmp = new JobDescByPriority();
        int rsl = cmp.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isLessThan(0);
    }
}
