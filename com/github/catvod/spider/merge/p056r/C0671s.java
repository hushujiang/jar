package com.github.catvod.spider.merge.p056r;

import com.github.catvod.spider.merge.atm;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.github.catvod.spider.merge.r.s */
/* loaded from: classes.dex */
public final class C0671s {
    /* renamed from: a */
    public static String m114a(String str) {
        int i = C0664l.f1259a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static String m113b(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = atm.m897d("040F1619");
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger(atm.m897d("0915175B2B37051D1610623B0517171A2276081B0910620B1E08131B2B2B"));
                    Level level = Level.WARNING;
                    String m897d = atm.m897d("2F0219103C2C03151455282D181314126C340F141310222C2C1508182D2C4A1C15076C");
                    String valueOf = String.valueOf(sb3);
                    logger.log(level, valueOf.length() != 0 ? m897d.concat(valueOf) : new String(m897d), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append(atm.m897d("56"));
                    sb4.append(sb3);
                    sb4.append(atm.m897d("4A0E1207292F4A"));
                    sb4.append(name2);
                    sb4.append(atm.m897d("54"));
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf(atm.m897d("4F09"), i3)) != -1) {
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb5.append(atm.m897d("4A21"));
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(atm.m897d("465A"));
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
