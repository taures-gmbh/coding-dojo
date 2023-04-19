import {add} from "../main/add";

describe('testing add function', () => {
    test('empty string should result in zero', () => {
        expect(add('')).toBe(0);
    });

    test('negative number should throw error', () => {
        expect(() => add('-1')).toThrow(RangeError);
    });

    test('1 + 2 should return correct value', () => {
        expect(add('1,2')).toBe(3);
    });
});
