package com.github.catvod.spider.merge.p004E;

import com.github.catvod.spider.merge.atm;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.E.a */
/* loaded from: classes.dex */
public final class C0018a implements Serializable {

    /* renamed from: a */
    private String f86a;

    /* renamed from: b */
    private String f87b;

    /* renamed from: c */
    private String f88c;

    public C0018a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException(atm.m897d("2615191420781A1B08016C36050E5A142034050D1F116C2C055A18106C361F1616"));
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.f86a = str;
        this.f87b = str2;
        this.f88c = str3;
    }

    /* renamed from: a */
    public final String m1452a() {
        return this.f87b;
    }

    /* renamed from: b */
    public final String m1451b() {
        return this.f86a;
    }

    /* renamed from: c */
    public final String m1450c() {
        return this.f88c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0018a)) {
            C0018a c0018a = (C0018a) obj;
            return this.f87b.equals(c0018a.f87b) && this.f86a.equals(c0018a.f86a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f86a.hashCode() ^ this.f87b.hashCode();
    }

    public final String toString() {
        if (this.f86a.equals("")) {
            return this.f87b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(atm.m897d("11"));
        stringBuffer.append(this.f86a);
        stringBuffer.append(atm.m897d("17"));
        stringBuffer.append(this.f87b);
        return stringBuffer.toString();
    }
}
