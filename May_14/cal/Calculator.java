package club.banyuan.cal;

public class Calculator {

    private static final int MAX_NUMBER = 9;
    private static final int INDEX_ZERO = 0;
    private static final int INDEX_ONE = 1;
    private static final int INDEX_TWO = 2;

    public Calculator() {
    }

    /**
     * 0 个符号: IllegalInputException: "Illegal Token Length"
     * 1 个符号:
     * "quit" (不区分大小写): QuitException
     * 所有其他情况: IllegalInputException: "Illegal Argument"
     * 2 个符号:
     * "-" 和数字: 返回负数
     * "-" 和非数字: IllegalInputException: "Illegal Argument"
     * 其他字符串: IllegalInputException: "Illegal Operator"
     * 3 个符号:
     * 数字1, "+", 数字2: 返回两个数字的和
     * 数字1, "/", 0: DivideByZeroException
     * 数字1, "/", 非零数字:  返回两个数字的商
     * 非数字，其他输入，其他输入: IllegalInputException: "Illegal Argument"
     * 数字1, 其他输入, 非数字: IllegalInputException: "Illegal Argument"
     * 数字1, 非运算符, 数字2: IllegalInputException: "Illegal Operator"
     * 4 更多的运算符: IllegalInputException: "Illegal Token Length"
     * <p>
     * Note: 所有数字都是整数
     *
     * @param tokens 符号数组，包含用户输入的操作数或操作符
     * @return 计算表达式的结果
     * @throws CalculatorException 如果用户输入不合法，或者已键入“ quit”。抛出CalculatorException 的几个子类之一，以便提供有关错误原因的更多信息.
     */

    public static int compute(String[] tokens) throws CalculatorException, QuitException, IllegalInputException {
        // 不同符号数量的各种情况
        switch (tokens.length) {
            // case 0 和 default重复，可以省略
//            case 0:
//                // TODO: complete the cases
//                throw new IllegalInputException("Illegal Token Length");
//                break;
            case 1:
                // 只有一种情况，用户输入 quit
                // TODO: complete the cases
                if (tokens[INDEX_ZERO].toLowerCase().equals("quit")) {
                    throw new QuitException();
                } else {
                    throw new IllegalInputException("Illegal Argument");
                }

            case 2:
                // 只有一种情况，用户输入 负数
                // TODO: complete the cases
                if (tokens[INDEX_ZERO].equals("-")) {
                    if (Integer.parseInt(tokens[INDEX_ONE]) >= 0 && Integer.parseInt(tokens[INDEX_ONE]) <= MAX_NUMBER) {
                        return -Integer.parseInt(tokens[INDEX_ONE]);
                    } else {
                        throw new IllegalInputException("Illegal Argument");
                    }
                } else {
                    throw new IllegalInputException("Illegal Operator");
                }

            case 3:
                // 计算表达式
                // TODO: complete the cases
                if (Integer.parseInt(tokens[INDEX_ZERO]) >= 0 && Integer.parseInt(tokens[INDEX_ZERO]) <= MAX_NUMBER) {
                    if (tokens[INDEX_ONE].equals("+")) {
                        if (Integer.parseInt(tokens[INDEX_TWO]) >= 0 && Integer.parseInt(tokens[INDEX_TWO]) <= MAX_NUMBER) {
                            return Integer.parseInt(tokens[INDEX_ZERO]) + Integer.parseInt(tokens[INDEX_TWO]);
                        } else {
                            throw new IllegalInputException("Illegal Argument");
                        }
                    } else if (tokens[INDEX_ONE].equals("/")) {
                        if (Integer.parseInt(tokens[INDEX_TWO]) == 0) {
                            throw new DivideByZeroException();
                        } else if (Integer.parseInt(tokens[INDEX_TWO]) >= 1 && Integer.parseInt(tokens[INDEX_TWO]) <= MAX_NUMBER) {
                            return Integer.parseInt(tokens[INDEX_ZERO]) / Integer.parseInt(tokens[INDEX_TWO]);
                        } else {
                            throw new IllegalInputException("Illegal Argument");
                        }
                    } else {
                        throw new IllegalInputException("Illegal Operator");
                    }
                } else {
                    throw new IllegalInputException("Illegal Argument");
                }

            default:
                // 4个或等多操作符号抛出异常
                // TODO: complete the cases
                throw new IllegalInputException("Illegal Token Length");
        }
    }

    /**
     * 将输入字符串解析为表达式并对其求值。
     * <p>
     * 如果输入是合法表达式，则打印结果
     * <p>
     * 否则抛出CalculatorException。根据异常类型打印消息。
     * <p>
     * 始终打印出输入内容。为此使用finally块。
     * <p>
     * 始终遵循以下规则打印两行：
     * 第一行:
     * -No Exception: "The result is: " + result
     * -QuitException: "Quitting"
     * -DivideByZeroException: "Tried to divide by zero"
     * -IllegalInputException: "Illegal input: " + illegalinputtype(given to constructor)
     * -CalculatorException: <should never happen> e.getMessage()
     * 第二行:
     * "Input was: " + input
     *
     * @param input 可能包含数学表达式的字符串
     * @return true 如果String等于"quit"; false 其他情况
     */
    public static boolean parseAndCompute(String input) {
        // 提取所有运算符号
        String[] tokens = input.split(" ");
        try {
            // TODO: complete implementation.
            int result = compute(tokens);
            System.out.println("The result is :" + result);
        } catch (QuitException e) {
            // TODO: complete implementation.
            System.out.println("Quitting");
            System.out.println("thanks");
        } catch (IllegalInputException e) {
            // TODO: complete implementation.
            System.out.println(e);
        } catch (CalculatorException e) {
            // 这捕获了剩下的CalculatorException情况：DivideByZeroException
            // TODO: complete implementation.
            System.out.println(e);
        } finally {
            System.out.print("Input was :");
            for (String token : tokens) {
                System.out.print(token + "");
            }
        }

        // TODO: complete implementation.

        // 未指定退出
        return false;
    }
}
