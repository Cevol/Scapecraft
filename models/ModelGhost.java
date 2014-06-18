package models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGhost extends ModelBase
{
	//fields
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer LLeg;
	ModelRenderer RLeg;
	ModelRenderer Waist;
	ModelRenderer Body;
	ModelRenderer LBoob;
	ModelRenderer RBoob;
	ModelRenderer Neck;
	ModelRenderer Head;
	ModelRenderer Nose;
	ModelRenderer LArm1;
	ModelRenderer LArm2;
	ModelRenderer LHand;
	ModelRenderer RArm1;
	ModelRenderer RArm2;
	ModelRenderer RHand;
	ModelRenderer TopHair;
	ModelRenderer MidHair;
	ModelRenderer BackHair;
	ModelRenderer LStrandTop;
	ModelRenderer RStrandTop;
	ModelRenderer LStrandMiddle;
	ModelRenderer RStrandMiddle;
	ModelRenderer LStrandBottom;
	ModelRenderer RStrandBottom;
	ModelRenderer LEye;
	ModelRenderer REye;

	public ModelGhost()
	{
		textureWidth = 64;
		textureHeight = 32;

		Tail1 = new ModelRenderer(this, 50, 27);
		Tail1.addBox(-0.5F, 0F, 0F, 2, 4, 1);
		Tail1.setRotationPoint(0F, 20F, -2F);
		Tail1.setTextureSize(64, 32);
		Tail1.mirror = true;
		setRotation(Tail1, -0.5235988F, 0F, 0F);
		Tail2 = new ModelRenderer(this, 41, 24);
		Tail2.addBox(-0.5F, -1.5F, -0.5F, 2, 2, 2);
		Tail2.setRotationPoint(0F, 20F, -2F);
		Tail2.setTextureSize(64, 32);
		Tail2.mirror = true;
		setRotation(Tail2, -0.2230717F, 0F, 0F);
		Tail3 = new ModelRenderer(this, 28, 27);
		Tail3.addBox(-1.5F, -4.5F, -0.5F, 4, 3, 2);
		Tail3.setRotationPoint(0F, 20F, -2F);
		Tail3.setTextureSize(64, 32);
		Tail3.mirror = true;
		setRotation(Tail3, -0.2230717F, 0F, 0F);
		LLeg = new ModelRenderer(this, 24, 1);
		LLeg.addBox(-2.5F, -11.5F, 0F, 3, 8, 3);
		LLeg.setRotationPoint(0F, 20F, -2F);
		LLeg.setTextureSize(64, 32);
		LLeg.mirror = true;
		setRotation(LLeg, -0.0872665F, 0F, 0F);
		RLeg = new ModelRenderer(this, 37, 1);
		RLeg.addBox(0.5F, -11.5F, 0F, 3, 8, 3);
		RLeg.setRotationPoint(0F, 20F, -2F);
		RLeg.setTextureSize(64, 32);
		RLeg.mirror = true;
		setRotation(RLeg, -0.0872665F, 0F, 0F);
		Waist = new ModelRenderer(this, 1, 22);
		Waist.addBox(-2F, -14F, 1F, 5, 3, 3);
		Waist.setRotationPoint(0F, 20F, -2F);
		Waist.setTextureSize(64, 32);
		Waist.mirror = true;
		setRotation(Waist, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 1, 1);
		Body.addBox(-3F, -20F, 0.5F, 7, 6, 4);
		Body.setRotationPoint(0F, 20F, -2F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		LBoob = new ModelRenderer(this, 53, 15);
		LBoob.addBox(-1F, -1F, -1F, 3, 3, 2);
		LBoob.setRotationPoint(-1.8F, 1.6F, -0.7F);
		LBoob.setTextureSize(64, 32);
		LBoob.mirror = true;
		setRotation(LBoob, -0.3665191F, -0.0698132F, 0.0698132F);
		RBoob = new ModelRenderer(this, 53, 9);
		RBoob.addBox(-2F, -1F, -1F, 3, 3, 2);
		RBoob.setRotationPoint(2.8F, 1.6F, -0.7F);
		RBoob.setTextureSize(64, 32);
		RBoob.mirror = true;
		setRotation(RBoob, -0.3665191F, 0.0698132F, -0.0698132F);
		Neck = new ModelRenderer(this, 31, 21);
		Neck.addBox(0F, 1F, 0F, 2, 2, 2);
		Neck.setRotationPoint(-0.5F, -2.5F, -0.7F);
		Neck.setTextureSize(64, 32);
		Neck.mirror = true;
		setRotation(Neck, 0F, 0F, 0F);
		Head = new ModelRenderer(this, 1, 12);
		Head.addBox(0F, 0F, 0F, 4, 5, 4);
		Head.setRotationPoint(-1.5F, -6.5F, -1.5F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Nose = new ModelRenderer(this, 1, 29);
		Nose.addBox(0F, 0F, 0F, 1, 1, 1);
		Nose.setRotationPoint(0F, -3.5F, -1.5F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, -0.2617994F, 0F, 0F);
		LArm1 = new ModelRenderer(this, 23, 25);
		LArm1.addBox(-3.8F, 0.5F, 0F, 1, 6, 1);
		LArm1.setRotationPoint(0F, 0F, 0F);
		LArm1.setTextureSize(64, 32);
		LArm1.mirror = true;
		setRotation(LArm1, -0.1396263F, 0F, 0.1745329F);
		LArm2 = new ModelRenderer(this, 18, 26);
		LArm2.addBox(-3.8F, 3.9F, 4.2F, 1, 3, 1);
		LArm2.setRotationPoint(0F, 0F, 0F);
		LArm2.setTextureSize(64, 32);
		LArm2.mirror = true;
		setRotation(LArm2, -0.9203772F, 0F, 0.1745329F);
		LHand = new ModelRenderer(this, 6, 29);
		LHand.addBox(-4.3F, 6.9F, 4.1F, 2, 2, 1);
		LHand.setRotationPoint(0F, 0F, 0F);
		LHand.setTextureSize(64, 32);
		LHand.mirror = true;
		setRotation(LHand, -0.9203772F, 0F, 0.1745329F);
		RArm1 = new ModelRenderer(this, 23, 25);
		RArm1.addBox(3.8F, 0.5F, 0F, 1, 6, 1);
		RArm1.setRotationPoint(0F, 0F, 0F);
		RArm1.setTextureSize(64, 32);
		RArm1.mirror = true;
		setRotation(RArm1, -0.1396263F, 0F, -0.1745329F);
		RArm2 = new ModelRenderer(this, 18, 26);
		RArm2.addBox(3.8F, 3.9F, 4.2F, 1, 3, 1);
		RArm2.setRotationPoint(0F, 0F, 0F);
		RArm2.setTextureSize(64, 32);
		RArm2.mirror = true;
		setRotation(RArm2, -0.9203772F, 0F, -0.1745329F);
		RHand = new ModelRenderer(this, 6, 29);
		RHand.addBox(3.3F, 6.9F, 4.1F, 2, 2, 1);
		RHand.setRotationPoint(0F, 0F, 0F);
		RHand.setTextureSize(64, 32);
		RHand.mirror = true;
		setRotation(RHand, -0.9203772F, 0F, -0.1745329F);
		TopHair = new ModelRenderer(this, 31, 14);
		TopHair.addBox(0F, 0F, 0F, 5, 1, 5);
		TopHair.setRotationPoint(-2F, -7F, -2F);
		TopHair.setTextureSize(64, 32);
		TopHair.mirror = true;
		setRotation(TopHair, -0.0743572F, 0F, 0F);
		MidHair = new ModelRenderer(this, 50, 1);
		MidHair.addBox(0F, 1.7F, 1.5F, 5, 5, 2);
		MidHair.setRotationPoint(-2F, -7F, -2F);
		MidHair.setTextureSize(64, 32);
		MidHair.mirror = true;
		setRotation(MidHair, 0.2921619F, 0F, 0F);
		BackHair = new ModelRenderer(this, 18, 13);
		BackHair.addBox(0F, 1F, 4F, 5, 10, 1);
		BackHair.setRotationPoint(-2F, -7F, -2F);
		BackHair.setTextureSize(64, 32);
		BackHair.mirror = true;
		setRotation(BackHair, 0.074351F, 0F, 0F);
		LStrandTop = new ModelRenderer(this, 59, 21);
		LStrandTop.addBox(0F, 1F, 4F, 1, 10, 1);
		LStrandTop.setRotationPoint(-2F, -7F, -2F);
		LStrandTop.setTextureSize(64, 32);
		LStrandTop.mirror = true;
		setRotation(LStrandTop, 0.074351F, 0F, 0.1396263F);
		RStrandTop = new ModelRenderer(this, 59, 21);
		RStrandTop.addBox(0F, 1F, 4F, 1, 10, 1);
		RStrandTop.setRotationPoint(2F, -7F, -2F);
		RStrandTop.setTextureSize(64, 32);
		RStrandTop.mirror = true;
		setRotation(RStrandTop, 0.074351F, 0F, -0.1396263F);
		LStrandMiddle = new ModelRenderer(this, 59, 21);
		LStrandMiddle.addBox(0F, 4F, 4F, 1, 10, 1);
		LStrandMiddle.setRotationPoint(0F, -7F, -2F);
		LStrandMiddle.setTextureSize(64, 32);
		LStrandMiddle.mirror = true;
		setRotation(LStrandMiddle, 0.074351F, 0F, 0.1919862F);
		RStrandMiddle = new ModelRenderer(this, 59, 21);
		RStrandMiddle.addBox(0F, 4F, 4F, 1, 10, 1);
		RStrandMiddle.setRotationPoint(0F, -7F, -2F);
		RStrandMiddle.setTextureSize(64, 32);
		RStrandMiddle.mirror = true;
		setRotation(RStrandMiddle, 0.074351F, 0F, -0.1919862F);
		LStrandBottom = new ModelRenderer(this, 59, 21);
		LStrandBottom.addBox(0F, 6F, 4F, 1, 10, 1);
		LStrandBottom.setRotationPoint(0F, -7F, -2F);
		LStrandBottom.setTextureSize(64, 32);
		LStrandBottom.mirror = true;
		setRotation(LStrandBottom, 0.074351F, 0F, 0.0698132F);
		RStrandBottom = new ModelRenderer(this, 59, 21);
		RStrandBottom.addBox(0F, 6F, 4F, 1, 10, 1);
		RStrandBottom.setRotationPoint(0F, -7F, -2F);
		RStrandBottom.setTextureSize(64, 32);
		RStrandBottom.mirror = true;
		setRotation(RStrandBottom, 0.074351F, 0F, -0.0698132F);
		LEye = new ModelRenderer(this, 13, 29);
		LEye.addBox(0F, 0F, 0F, 1, 1, 1);
		LEye.setRotationPoint(-0.8F, -5F, -1.6F);
		LEye.setTextureSize(64, 32);
		LEye.mirror = true;
		setRotation(LEye, 0F, 0F, 0F);
		REye = new ModelRenderer(this, 12, 29);
		REye.addBox(0F, 0F, 0F, 1, 1, 1);
		REye.setRotationPoint(0.8F, -5F, -1.6F);
		REye.setTextureSize(64, 32);
		REye.mirror = true;
		setRotation(REye, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Tail1.render(f5);
		Tail2.render(f5);
		Tail3.render(f5);
		LLeg.render(f5);
		RLeg.render(f5);
		Waist.render(f5);
		Body.render(f5);
		LBoob.render(f5);
		RBoob.render(f5);
		Neck.render(f5);
		Head.render(f5);
		Nose.render(f5);
		LArm1.render(f5);
		LArm2.render(f5);
		LHand.render(f5);
		RArm1.render(f5);
		RArm2.render(f5);
		RHand.render(f5);
		TopHair.render(f5);
		MidHair.render(f5);
		BackHair.render(f5);
		LStrandTop.render(f5);
		RStrandTop.render(f5);
		LStrandMiddle.render(f5);
		RStrandMiddle.render(f5);
		LStrandBottom.render(f5);
		RStrandBottom.render(f5);
		LEye.render(f5);
		REye.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}
