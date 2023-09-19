package com.github.catvod.spider.merge.p055q;

import android.net.Uri;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.atm;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.q.d */
/* loaded from: classes.dex */
public final class C0652d {

    /* renamed from: a */
    public static final List<String> f1245a = Arrays.asList(atm.m897d("070A4E"), atm.m897d("07110C"), atm.m897d("1D170C"), atm.m897d("0C160C"), atm.m897d("0B0C13"), atm.m897d("070A49"), atm.m897d("0B1B19"), atm.m897d("0C161B16"), atm.m897d("074E1B"));

    /* renamed from: b */
    public static final Pattern f1246b = Pattern.compile(atm.m897d("020E0E056470555B120138284354530E7D6A46074529627007490F4D30351A4E0613202E161B0C1C3035010C060721241D170C0921280D0617412D24070A495C10674450061D382C1A52524A6D301E0E0A5C6271114B4859310444521746396016170A41303E060C06143A3116171103302A07060D183A24070A1D09216C0B0617057F7116120E013C7042455B1D382C1A53545C66671C131E1023771E15095F"));

    /* renamed from: a */
    public static String m150a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance(atm.m897d("273E4F")).digest(str.getBytes(atm.m897d("3F2E3C5874")))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, atm.m897d("5A"));
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static int m149b() {
        return (int) TypedValue.applyDimension(1, 240, Init.context().getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static String m148c(String str, String str2) {
        if (str2.startsWith(atm.m897d("4555"))) {
            Uri parse = Uri.parse(str);
            return parse.getScheme() + atm.m897d("50") + str2;
        }
        String m897d = atm.m897d("505555");
        if (str2.contains(m897d)) {
            return str2;
        }
        Uri parse2 = Uri.parse(str);
        return parse2.getScheme() + m897d + parse2.getHost() + str2;
    }

    /* renamed from: d */
    public static String m147d(String str) {
        return str.substring(str.lastIndexOf(atm.m897d("44")) + 1);
    }

    /* renamed from: e */
    public static String m146e(double d) {
        if (d <= 0.0d) {
            return "";
        }
        String m897d = atm.m897d("4F544813692B");
        return d > 1.099511627776E12d ? String.format(Locale.getDefault(), m897d, Double.valueOf(d / 1.099511627776E12d), atm.m897d("3E38")) : d > 1.073741824E9d ? String.format(Locale.getDefault(), m897d, Double.valueOf(d / 1.073741824E9d), atm.m897d("2D38")) : d > 1048576.0d ? String.format(Locale.getDefault(), m897d, Double.valueOf(d / 1048576.0d), atm.m897d("2738")) : String.format(Locale.getDefault(), m897d, Double.valueOf(d / 1024.0d), atm.m897d("2138"));
    }

    /* renamed from: f */
    public static String m145f(String str, String str2) {
        String[] split;
        for (String str3 : str.split(atm.m897d("1C1B08"))) {
            if (str3.contains(str2)) {
                String m897d = atm.m897d("4D");
                if (str3.contains(m897d)) {
                    return str3.split(m897d)[1];
                }
                String m897d2 = atm.m897d("48");
                return str3.contains(m897d2) ? str3.split(m897d2)[1] : "";
            }
        }
        return "";
    }

    /* renamed from: g */
    public static boolean m144g(String str) {
        return str.equals(atm.m897d("19080E")) || str.equals(atm.m897d("0B0909")) || str.equals(atm.m897d("19091B"));
    }

    /* renamed from: h */
    public static boolean m143h(String str) {
        if (str.contains(atm.m897d("1F081648242C1E0A")) || str.contains(atm.m897d("441009")) || str.contains(atm.m897d("44190906")) || str.contains(atm.m897d("44120E1820"))) {
            return false;
        }
        return f1246b.matcher(str).find();
    }

    /* renamed from: i */
    public static boolean m142i(String str) {
        for (String str2 : Arrays.asList(atm.m897d("030B130C2576091517"), atm.m897d("1C540B04623B0517"), atm.m897d("13150F1E3976091517"), atm.m897d("061F54162335"), atm.m897d("1E0F1E1A3976091517"), atm.m897d("071D0E03623B0517"), atm.m897d("19151200623B0517"), atm.m897d("0B191C0022760914"), atm.m897d("0813161C2E31061354162335"), atm.m897d("081B151329360D54191A21"), atm.m897d("1A0A0E03623B0517"))) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static void m141j(final String str, final WebViewClient webViewClient) {
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.q.c
            @Override // java.lang.Runnable
            public final void run() {
                WebViewClient webViewClient2 = webViewClient;
                String str2 = str;
                WebView webView = new WebView(Init.context());
                webView.getSettings().setDatabaseEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptEnabled(true);
                try {
                    ((ViewGroup) Init.getActivity().getWindow().getDecorView().findViewById(16908290)).addView(webView, new ViewGroup.LayoutParams(0, 0));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                webView.setWebViewClient(webViewClient2);
                webView.loadUrl(str2);
            }
        });
    }

    /* renamed from: k */
    public static String m140k(String str) {
        String m897d = atm.m897d("44");
        return str.contains(m897d) ? str.substring(0, str.lastIndexOf(m897d)) : str;
    }
}
