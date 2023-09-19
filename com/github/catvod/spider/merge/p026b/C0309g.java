package com.github.catvod.spider.merge.p026b;

import com.github.catvod.spider.merge.atm;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.github.catvod.spider.merge.b.g */
/* loaded from: classes.dex */
public final class C0309g {
    @SerializedName("url")

    /* renamed from: a */
    private String f580a;
    @SerializedName("name")

    /* renamed from: b */
    private String f581b;
    @SerializedName("lang")

    /* renamed from: c */
    private String f582c;
    @SerializedName("format")

    /* renamed from: d */
    private String f583d;

    /* renamed from: a */
    public final C0309g m878a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 96897:
                if (str.equals(atm.m897d("0B0909"))) {
                    c = 0;
                    break;
                }
                break;
            case 114177:
                if (str.equals(atm.m897d("19091B"))) {
                    c = 1;
                    break;
                }
                break;
            case 117110:
                if (str.equals(atm.m897d("1C0E0E"))) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                this.f583d = atm.m897d("1E1F0201632047090914");
                return this;
            case 2:
                this.f583d = atm.m897d("1E1F0201632E1E0E");
                return this;
            default:
                this.f583d = atm.m897d("0B0A0A19253B0B0E131A2277125709002E2A030A");
                return this;
        }
    }

    /* renamed from: b */
    public final C0309g m877b(String str) {
        this.f582c = str;
        return this;
    }

    /* renamed from: c */
    public final C0309g m876c(String str) {
        this.f581b = str;
        return this;
    }

    /* renamed from: d */
    public final C0309g m875d(String str) {
        this.f580a = str;
        return this;
    }
}
