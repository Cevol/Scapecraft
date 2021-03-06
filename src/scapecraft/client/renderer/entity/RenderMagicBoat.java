package scapecraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import scapecraft.client.model.ModelMagicBoat;
import scapecraft.entity.EntityMagicBoat;

public class RenderMagicBoat extends Render
{
	private static final ResourceLocation boatTextures = new ResourceLocation("scapecraft", "textures/entity/magicboat.png");
	protected ModelBase modelBoat;

	public RenderMagicBoat()
	{
		this.shadowSize = 0.5F;
		this.modelBoat = new ModelMagicBoat();
	}

	public void doRender(EntityMagicBoat entity, double x, double y, double z, float yaw, float pitch)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
		float f2 = (float)entity.getTimeSinceHit() - pitch;
		float f3 = entity.getDamageTaken() - pitch;

		if (f3 < 0.0F)
		{
			f3 = 0.0F;
		}

		if (f2 > 0.0F)
		{
			GL11.glRotatef(MathHelper.sin(f2) * f2 * f3 / 10.0F * (float)entity.getForwardDirection(), 1.0F, 0.0F, 0.0F);
		}

		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(1.0F / f4, 1.0F / f4, 1.0F / f4);
		this.bindEntityTexture(entity);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		this.modelBoat.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}

	public ResourceLocation getEntityTexture(Entity p_110775_1_)
	{
		return boatTextures;
	}

	public void doRender(Entity entity, double x, double y, double z, float yaw, float pitch)
	{
		this.doRender((EntityMagicBoat)entity, x, y, z, yaw, pitch);
	}
}
