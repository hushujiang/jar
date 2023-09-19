package com.github.catvod.spider.merge.p040i;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.i.b */
/* loaded from: classes.dex */
public final class C0563b {
    @SerializedName("url")

    /* renamed from: a */
    private String f1032a;
    @SerializedName("gmtCreate")

    /* renamed from: b */
    private String f1033b;
    @SerializedName("fileInfos")

    /* renamed from: c */
    private List<C0562a> f1034c;

    /* renamed from: a */
    public final String m319a() {
        return this.f1034c.get(0).m320a();
    }

    /* renamed from: b */
    public final C0310h m318b() {
        return new C0310h(this.f1032a, this.f1034c.get(0).m320a(), atm.m897d("020E0E053F624555131B292F19541D0125350D54191A2177041F0D062D281A2518016368454B49477A6B52494D4D7961454B4A457C"), this.f1033b);
    }
}
