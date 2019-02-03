package nyan;

public class Decryptor {

    private String encryptedString;

    public Decryptor(String encryptedString)
    {
        this.encryptedString = encryptedString;
    }

    public String decrypt()
    {
        String binaryForm = "", result = "";
        for (char c : encryptedString.toCharArray())
        {
            if (c >= 65 && c <= 90) binaryForm += '1';
            else binaryForm += '0';
        }

        int arrLength = binaryForm.length()/7;
        char[] tempAlp = new char[arrLength];

        for (int i = 0; i < arrLength; i++)
        {
            try
            {
                tempAlp[i] = (char) Integer.parseInt(binaryForm.substring(0, 7), 2);
                binaryForm = binaryForm.replaceFirst("[01]{7}", "");
            } catch (Exception e)
            {
                break;
            }
        }

        for (char c : tempAlp) result += Character.toString(c);
        return result;
    }

}
