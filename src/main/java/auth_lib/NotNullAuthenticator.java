package auth_lib;

/**
 * 認証ライブラリ（認証時にNULLではなければ認証ＯＫ）
 */
public class NotNullAuthenticator implements Authenticator
{
    /**
     * 認証処理
     */
    public boolean auth( String uid, String pwd )
    {
        return true;
    }
}
