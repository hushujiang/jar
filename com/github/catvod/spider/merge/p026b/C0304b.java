package com.github.catvod.spider.merge.p026b;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.b.b */
/* loaded from: classes.dex */
public final class C0304b {
    @SerializedName("type_id")

    /* renamed from: a */
    private String f560a;
    @SerializedName("type_name")

    /* renamed from: b */
    private String f561b;
    @SerializedName("type_flag")

    /* renamed from: c */
    private String f562c;

    public C0304b(String str, String str2) {
        this(str, str2, "");
    }

    public C0304b(String str, String str2, String str3) {
        this.f560a = str;
        this.f561b = str2;
        this.f562c = str3;
    }

    /* renamed from: a */
    public static List<C0304b> m896a(String str) {
        return (List) new Gson().fromJson(str, new C0303a().getType());
    }

    /* renamed from: b */
    public final String m895b() {
        return this.f560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0304b) {
            return this.f560a.equals(((C0304b) obj).f560a);
        }
        return false;
    }
}
