package com.dev.learn.dsa.array.leetcode.easy;

import com.dev.learn.dsa.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BuildArrayFromPermutationTest {
    private static final BuildArrayFromPermutation USE_CASE = new BuildArrayFromPermutation();

    @ParameterizedTest
    @MethodSource
    @DisplayName("buildArray() expected array from permutation")
    void buildArray(int[] source, int[] expected) {
        //given
        PrintUtils.print("source array: ", source);
        //when
        var result = USE_CASE.buildArray(source);
        //then
        assertThat(result).containsExactly(expected);
        PrintUtils.print("result array: ", result);
        PrintUtils.print("expected array: ", expected);
    }

    private static Stream<Arguments> buildArray() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 1, 5, 3, 4}, new int[]{0, 1, 2, 4, 5, 3}),
                Arguments.of(new int[]{5, 0, 1, 2, 3, 4}, new int[]{4, 5, 0, 1, 2, 3})
        );
    }
}